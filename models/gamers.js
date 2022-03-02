const mongoose = require('mongoose');
const Schema = mongoose.Schema;
const mongooseSoftDelete = require('mongoose-delete');

/**
 * Función para validar la estructura de un correo electrónico
 * @param string Correo a validar
 * @returns boolean
 */
const validateEmail = (email) => {
    var re = /[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?/;
    return re.test(email);
};

/**
 * En este fragmento de codigo se especifica el Schema que tendrán mis gamers en la base de datos.
 */

const gamerSchema = new Schema({
    name: {
        type: String,
        trim: true,
        required: [true,'Lo siento, debe ingresar un nombre para el jugador']
    },
    points: {
        type: Number,
        required:[true,'Lo siento, el jugador debe tener un numero de puntos'],
        min: 0,
        max:100
    },
    email: {
        type: String,
        lowercase: true,
        trim: true,
        required: [true, 'El correo es requerido'],
        unique: true,
        validate: {
            validator: validateEmail,
            message: 'Por favor digite un correo válido'
        }
    },
    createdAt: {
        type : Date,
        default: Date.now
    },
    deteledAt: {
        type : Date,
        required: false
    }


},{ timestamps: true });

gamerSchema.plugin(mongooseSoftDelete);

module.exports = Gamer = mongoose.model('Gamer',gamerSchema);