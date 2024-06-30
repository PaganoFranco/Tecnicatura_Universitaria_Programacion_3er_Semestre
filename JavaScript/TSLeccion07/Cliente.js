class Cliente extends Persona {
    static contadorClientes = 0;

    constructor(nombre, apellido, edad, fecharegistro) {
        super(nombre, apellido, edad);
        this._idCliente = ++Cliente.contadorClientes;
        this._fecharegistro = fecharegistro;
    }

    // Getters
    get idCliente() {
        return this._idCliente;
    }

    get fecharegistro() {
        return this._fecharegistro;
    }

    // Setters
    set fecharegistro(fecharegistro) {
        this._fecharegistro = fecharegistro;
    }

    // toString
    toString() {
        return super.toString()+" "+ this._idCliente+" "+this.fecharegistro;
    }
}