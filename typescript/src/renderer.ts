import { Shape } from './shapes/shape.js'

function newRenderer(shapeToRender: Shape) {
  return {
    draw() {
      const area: number = shapeToRender.computeArea()
      console.log('Shape drawn\n' + 'Its area is ' + area)
    }
  }
}

export { newRenderer }
