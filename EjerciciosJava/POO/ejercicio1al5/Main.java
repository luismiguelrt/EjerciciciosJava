package ejercicio1al5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaCorriente.setBanco("santander");
		
		
		
		
		
		
		CuentaCorriente miCuentaSaldo = new CuentaCorriente(200);
		System.out.println("cuenta solo saldo: ");
		miCuentaSaldo.showInformacion();
		System.out.println();
		
		CuentaCorriente miCuenta = new CuentaCorriente("luis", "76543218L");
		System.out.println("cuenta con nombre y DNI");
		System.out.println("saldo: "+miCuenta.getSaldo());
		System.out.println("ingresar 250:");
		miCuenta.ingresarDinero(250);
		System.out.println("saldo: "+miCuenta.getSaldo());
		miCuenta.sacarDinero(260);
		//miCuenta.showInformacion();
		miCuenta.sacarDinero(260);
		miCuenta.showInformacion();
		System.out.println();
		System.out.println("------ CAMBIO DE BANCO -------");
		CuentaCorriente.setBanco("bankia");
		miCuentaSaldo.showInformacion();
		
		CuentaCorriente miCuentaDNI = new CuentaCorriente("12345678L", 50,-30);
		System.out.println("cuenta con DNI, saldo y limite");
		miCuentaDNI.showInformacion();
		

	}

}
