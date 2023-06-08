package entities;

public class TaxPayer {
	
	private double salaryincome;
	private double serviesIncome;
	private double capitalIncome;
	private double healthSpeding;
	private double educationSpeding;
	
	public TaxPayer() {
		
	}
	
	public TaxPayer(double salaryincome, double serviesIncome, double capitalIncome, double healthSpeding, double educationSpeding) {
		this.salaryincome = salaryincome;
		this.serviesIncome = serviesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpeding = healthSpeding;
		this.educationSpeding = educationSpeding;
	}

	public double getSalaryincome() {
		return salaryincome;
	}

	public double getServiesIncome() {
		return serviesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public double getHealthSpeding() {
		return healthSpeding;
	}

	public double getEducationSpeding() {
		return educationSpeding;
	}

	public double salaryTax() {
		double impSa;
		double men = salaryincome / 12;
			if(men < 3000.00) {
				impSa = 0;
			}else if (men < 5000.0) {
					impSa = salaryincome * 0.1;
			}else {
				impSa = salaryincome * 0.2;
			}
		return impSa;
	}
	
	public double servicesTax() {
		return serviesIncome * 0.15;
	}
	
	public double capitalTax() {
		return capitalIncome * 0.2;
	}
	
	public double grossTax() {
		double tot = salaryTax() + servicesTax() + capitalTax();
		return tot;
	}
	
	public double taxRebate() {
		double maxDed = grossTax() * 0.3;
		double minDed = healthSpeding + educationSpeding;
		
		if(minDed > maxDed) {
			return maxDed;
		}else {
			return minDed;
		}
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}
	
	public String toString() {
		return "Imposto bruto total: " + String.format("%.2f", grossTax()) + "\n"
				+ "Abatimento: " + String.format("%.2f", taxRebate()) + "\n"
				+ "Imposto devido: " + String.format("%.2f", netTax());
	}

}
