var express = require('express');
var router = express.Router();

const Gamer = require('../models/game'); 

/**
 * Con este fragmento de codigo se añade a la base de datos un nuevo Juego
 * se usa el post, para insertar la informacion
  
 req.body.name es aquello que el servidor usará para agarrar la informacion

 Se debe ingresar el tipo de juego, los ID's de los jugadores, escribir si está en progreso o no, y enviar el ID del jugador ganador.
* 
 */

/* GET users listing. */
router.post('/', function(req, res, next) {
  const game = new Game({
    type: req.body.type,
    gamers: req.body.gamers,
    inProgress: req.body.inProgress,
    winner: req.body.winner
  });

  game.save().then((result) => { res.json(result) }).catch((err) => { res.json(err) });

});

module.exports = router; 

