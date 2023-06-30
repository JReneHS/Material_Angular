// unciones Simples
function mostrarHola() {
    console.log("Hola");
}

// Funciones con Parametros
function sumarDosNumeros(num1: number, num2: number) {
    console.log(num1 + num2);
}

// Funciones con Retorno
function restarDosNumeros(num1: number, num2: number): number {
    return num1 - num2;
}

/*
Por defecto, si no indicamos el tipo de retorno se
asigna el tipo "void".
*/