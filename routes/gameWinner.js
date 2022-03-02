var express = require('express');
var router = express.Router();

const gameWinner = require('../models/game'); 

/**
 * Con este fragmento de codigo se consulta el jugador ganador que este en la base de datos
 * se usa el get, para consultar la informacion
 * 
 se le debe mandar el ID del juego y el /winner para que funcione.
 */

/* GET users listing. */
router.get('/:id/winner', function(req, res, next) {
  const data = gameWinner.find({},{"winner":1,"_id":1});

  data.then(result => res.json(result)).catch(err => console.log(err));

});

module.exports = router; 
