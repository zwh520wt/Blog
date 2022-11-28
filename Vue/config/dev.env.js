'use strict'
const merge = require('webpack-merge')
const prodEnv = require('./prod.env')

module.exports = merge(prodEnv, {
  NODE_ENV: '"development"',
  BASE_API: '"http://localhost:8888"'
})

module.exports = {
  MODE_ENV: '"production"',
  BASE_API: '"/api/"'
}
