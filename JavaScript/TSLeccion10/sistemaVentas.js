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

class Orden {
    static contadorOrdenes = 0;
    static getMAX_PRODUCTOS() { //Metodo que simula una constante
        return 5;
    }

    constructor() {
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = []; //Inicializamos el arreglo 
        this._contadorProductosAgregados = 0;

    }

    get idOrden() {
        return this._idOrden;
    }

    agregarProducto(producto) {
        if (this._productos.length < Orden.getMAX_PRODUCTOS()) {
            this._productos.push(producto); // SINTAXIS 1
            //this._productos[this._contadorProductosAgregados++] = producto; //Sintaxis 2
        }
        else {
            console.log("No se pueden agregar mas productos")
        }

    } // Fin de metodo agregar produucto

} //Fin Class Orden

let producto1 = new Producto('Pantalon', 200);
let producto2 = new Producto('Camisa', 150);
console.log(producto1.toString());
console.log(producto2.toString());