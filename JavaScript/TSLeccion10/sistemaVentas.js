class Producto {
    static contadorProductos = 0;
    constructor(nombre, precio) {
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }
    get idProducto() {
        return rhis._idProducto;
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre) {
        this._nombre = nombre;
    }

    get precio() {
        return this._precio;
    }

    set precio(precio) {
        this._precio;
    }

    toString() {
        return `idProducto : ${this._idProducto}, nombre : ${this._nombre}, precio : $${this._precio}`;
    }

} // Fin Class Producto

let producto1 = new Producto('Pantalon', 200);
let producto2 = new Producto('Camisa', 150);
console.log(producto1.toString());
console.log(producto2.toString());