package model;

import java.util.Date;

public class AsseguradoDependenteEmpresarial extends Assegurado {
	
	public AsseguradoDependenteEmpresarial(String id, Date dataAssinatura, int mesesVigencia, double mensalidade,
			String cpfAssegurado, boolean status, String cnpjResponsavel) {
		super(id, dataAssinatura, mesesVigencia, mensalidade, cpfAssegurado, status);
		this.cnpjResponsavel = cnpjResponsavel;
	}

	public String cnpjResponsavel;
	
	
}
