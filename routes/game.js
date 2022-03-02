var express = require('express');
var router = express.Router();

const Game = require('../models/game'); 

/**
 * Con este fragmento de codigo se consultan todos los gamers que esten en la base de datos
 * se usa el get, para consultar la informacion
 */

/* GET users listing. */
router.get('/:id', function(req, res, next) {
  const data = Game.find();

  data.then(result => res.json(result)).catch(err => console.log(err));

});

module.exports = router; 
