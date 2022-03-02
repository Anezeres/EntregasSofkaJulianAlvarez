var express = require('express');
var router = express.Router();

const Gamer = require('../models/gamers'); 

/**
 * Con este fragmento de codigo se consultan todos los gamers que esten en la base de datos
 * se usa el get, para consultar la informacion
 */

/* GET users listing. */
router.get('/', function(req, res, next) {
  const data = Gamer.find({
    $or: [
      { 'deleted': { $eq: false } },
      { 'deleted': { $exists: false } },
    ]
  });

  data.then(result => res.json(result)).catch(err => console.log(err));

});

module.exports = router; 
