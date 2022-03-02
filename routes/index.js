const express = require('express');
const router = express.Router();

/**
 * Al realizar un consulta con el Thunder, esta es la pagina index
 */

/* GET home page. */
router.get('/', function(req, res, next) {
  res.json({
    message: 'Hola mundo cruel'
  });
});

module.exports = router;
