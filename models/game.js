const mongoose = require('mongoose');
const Schema = mongoose.Schema;
const mongooseSoftDelete = require('mongoose-delete');



/**
 * En este fragmento de codigo se especifica el Schema que tendrán mis gamers en la base de datos.
 */

const gameSchema = new Schema({
    type: {
        type: String,
        trim: true,
        required: [true,'Lo siento, debe ingresar un tipo de juego']
    },
    gamers:{
        type: [{
            type: Schema.Types.ObjectId,
            required: [true,'Ingrese el ID de los jugadores']
        }]
    },
    inProgress:{
        type: Boolean,
        required: [true,'Ingrese el estado del juego']
    },
    winner: {
        type: Schema.Types.ObjectId,
        required: [true,'Debe ingresar el ID del jugador']     
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

gameSchema.plugin(mongooseSoftDelete);

module.exports = Game = mongoose.model('Game',gameSchema);