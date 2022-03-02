var express = require('express');
var router = express.Router();

const Gamer = require('../models/gamers'); 

/**
 * Con este fragmento de codigo se añade a la base de datos un nuevo gamer o usuario
 * se usa el post, para insertar la informacion
  
 req.body.name es aquello que el servidor usará para agarrar la informacion

 Se le debe ingresar el nombre, los puntos que posee el jugador y el email del jugador.
* 

 */

/* GET users listing. */
router.post('/', function(req, res, next) {
  const user = new Gamer({
    name: req.body.name,
    points: req.body.points,
    email: req.body.email,
  });

  user.save().then((result) => { res.json(result) }).catch((err) => { res.json(err) });
});

module.exports = router;
