package model;

import java.util.*;

import com.google.gson.annotations.Expose;

public abstract class Apolice {
	@Expose
	public int id;
	@Expose
	public String dataAssinatura;
	
	@Expose
	public int mesesVigencia;
	@Expose
	public double mensalidade;
	
	public Assegurado assegurado;
	@Expose
	public String cpfAssegurado;
	@Expose
	public boolean status;

}
