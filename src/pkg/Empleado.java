package pkg;

public class Empleado {
	public enum TipoEmpleado {
		Vendedor, Encargado, Otro
	};

	public static float calculoNominaBruta(TipoEmpleado tipo/* 3 pruebas */, float ventasMes/* 4 pruebas, una en negativo */, float horasExtra/* 2 pruebas (negativo y positivo) */) {
		float salario = 0;
		if (tipo == TipoEmpleado.Vendedor)
			salario = 2000;
		else {
			if (tipo == TipoEmpleado.Encargado)
				salario = 2500;
			else {
				if (tipo == TipoEmpleado.Otro)
					return 0;
				else
					System.out.println("Error, tipo no valido");
			}

		}
		if (ventasMes >= 1500)
			salario += 200;
		else
		{
			if (ventasMes >= 1000)
				salario += 100;
			else {
				if(ventasMes<0)
					return 0;
			}
		}
		if(horasExtra<0)
			return 0;
		else {
			salario = salario + horasExtra * 30;
		}
		return salario;
	}

	public static float calculoNominaNeta(float nominaBruta/* 4 pruebas, una en negativo */) {
		float retencion = 0;
		if (nominaBruta >= 2500)
			retencion = (float) 0.18;
		else {
			if (nominaBruta >= 2100)
				retencion = (float) 0.15;
			else {
				if (nominaBruta < 0)
					return 0;
			}
		}
		return nominaBruta * (1-retencion);
	}
}