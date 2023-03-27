import org.jgap.FitnessFunction;
import org.jgap.IChromosome;

@SuppressWarnings("serial")
public class FAptitud extends FitnessFunction {

	double apto = 0;

	public double evaluate(IChromosome cromosoma) {
		apto = 0;

		evaluarfila1(cromosoma);
		evaluarfila2(cromosoma);
		evaluarfila3(cromosoma);
		evaluarhor11(cromosoma);
		evaluarhor12(cromosoma);
		evaluarhor13(cromosoma);
		evaluardiag1(cromosoma);
		evaluardiag2(cromosoma);
		evarepetidos(cromosoma);

		return (apto);
	}

	public void evaluarfila1(IChromosome cromosoma) {
		Integer vgen0 = (Integer) cromosoma.getGene(0).getAllele();
		Integer vgen1 = (Integer) cromosoma.getGene(1).getAllele();
		Integer vgen2 = (Integer) cromosoma.getGene(2).getAllele();
		if ((vgen0 + vgen1 + vgen2) == 15)
			apto += 1;
	}

	public void evaluarfila2(IChromosome cromosoma) {
		Integer vgen3 = (Integer) cromosoma.getGene(3).getAllele();
		Integer vgen4 = (Integer) cromosoma.getGene(4).getAllele();
		Integer vgen5 = (Integer) cromosoma.getGene(5).getAllele();
		if ((vgen3 + vgen4 + vgen5) == 15)
			apto += 1;
	}

	public void evaluarfila3(IChromosome cromosoma) {
		Integer vgen6 = (Integer) cromosoma.getGene(6).getAllele();
		Integer vgen7 = (Integer) cromosoma.getGene(7).getAllele();
		Integer vgen8 = (Integer) cromosoma.getGene(8).getAllele();
		if ((vgen6 + vgen7 + vgen8) == 15)
			apto += 1;
	}

	public void evaluarhor11(IChromosome cromosoma) {
		Integer vgen0 = (Integer) cromosoma.getGene(0).getAllele();
		Integer vgen3 = (Integer) cromosoma.getGene(3).getAllele();
		Integer vgen6 = (Integer) cromosoma.getGene(6).getAllele();
		if ((vgen0 + vgen3 + vgen6) == 15)
			apto += 1;
	}

	public void evaluarhor12(IChromosome cromosoma) {
		Integer vgen1 = (Integer) cromosoma.getGene(1).getAllele();
		Integer vgen4 = (Integer) cromosoma.getGene(4).getAllele();
		Integer vgen7 = (Integer) cromosoma.getGene(7).getAllele();
		if ((vgen1 + vgen4 + vgen7) == 15)
			apto += 1;
	}

	public void evaluarhor13(IChromosome cromosoma) {
		Integer vgen2 = (Integer) cromosoma.getGene(2).getAllele();
		Integer vgen5 = (Integer) cromosoma.getGene(5).getAllele();
		Integer vgen8 = (Integer) cromosoma.getGene(8).getAllele();
		if ((vgen2 + vgen5 + vgen8) == 15)
			apto += 1;
	}

	public void evaluardiag1(IChromosome cromosoma) {
		Integer vgen0 = (Integer) cromosoma.getGene(0).getAllele();
		Integer vgen4 = (Integer) cromosoma.getGene(4).getAllele();
		Integer vgen8 = (Integer) cromosoma.getGene(8).getAllele();
		if ((vgen0 + vgen4 + vgen8) == 15)
			apto += 1;
	}

	public void evaluardiag2(IChromosome cromosoma) {
		Integer vgen2 = (Integer) cromosoma.getGene(2).getAllele();
		Integer vgen4 = (Integer) cromosoma.getGene(4).getAllele();
		Integer vgen6 = (Integer) cromosoma.getGene(6).getAllele();
		if ((vgen2 + vgen4 + vgen6) == 15)
			apto += 1;
	}

	public void evarepetidos(IChromosome cromosoma) {
		Integer gen0 = (Integer) cromosoma.getGene(0).getAllele();
		Integer gen1 = (Integer) cromosoma.getGene(1).getAllele();
		Integer gen2 = (Integer) cromosoma.getGene(2).getAllele();
		Integer gen3 = (Integer) cromosoma.getGene(3).getAllele();
		Integer gen4 = (Integer) cromosoma.getGene(4).getAllele();
		Integer gen5 = (Integer) cromosoma.getGene(5).getAllele();
		Integer gen6 = (Integer) cromosoma.getGene(6).getAllele();
		Integer gen7 = (Integer) cromosoma.getGene(7).getAllele();
		Integer gen8 = (Integer) cromosoma.getGene(8).getAllele();

		if ((gen0.compareTo(gen1) != 0) && (gen0.compareTo(gen2) != 0) && (gen0.compareTo(gen3) != 0)
				&& (gen0.compareTo(gen4) != 0) && (gen0.compareTo(gen5) != 0) && (gen0.compareTo(gen6) != 0)
				&& (gen0.compareTo(gen7) != 0) && (gen0.compareTo(gen8) != 0))
			apto += 1;

		if ((gen1.compareTo(gen0) != 0) && (gen1.compareTo(gen2) != 0) && (gen1.compareTo(gen3) != 0)
				&& (gen1.compareTo(gen4) != 0) && (gen1.compareTo(gen5) != 0) && (gen1.compareTo(gen6) != 0)
				&& (gen1.compareTo(gen7) != 0) && (gen1.compareTo(gen8) != 0))
			apto += 1;

		if ((gen2.compareTo(gen0) != 0) && (gen2.compareTo(gen1) != 0) && (gen2.compareTo(gen3) != 0)
				&& (gen2.compareTo(gen4) != 0) && (gen2.compareTo(gen5) != 0) && (gen2.compareTo(gen6) != 0)
				&& (gen2.compareTo(gen7) != 0) && (gen2.compareTo(gen8) != 0))
			apto += 1;

		if ((gen3.compareTo(gen0) != 0) && (gen3.compareTo(gen1) != 0) && (gen3.compareTo(gen2) != 0)
				&& (gen3.compareTo(gen4) != 0) && (gen3.compareTo(gen5) != 0) && (gen3.compareTo(gen6) != 0)
				&& (gen3.compareTo(gen7) != 0) && (gen3.compareTo(gen8) != 0))
			apto += 1;

		if ((gen4.compareTo(gen0) != 0) && (gen4.compareTo(gen1) != 0) && (gen4.compareTo(gen2) != 0)
				&& (gen4.compareTo(gen3) != 0) && (gen4.compareTo(gen5) != 0) && (gen4.compareTo(gen6) != 0)
				&& (gen4.compareTo(gen7) != 0) && (gen4.compareTo(gen8) != 0))
			apto += 1;

		if ((gen5.compareTo(gen0) != 0) && (gen5.compareTo(gen1) != 0) && (gen5.compareTo(gen2) != 0)
				&& (gen5.compareTo(gen3) != 0) && (gen5.compareTo(gen4) != 0) && (gen5.compareTo(gen6) != 0)
				&& (gen5.compareTo(gen7) != 0) && (gen5.compareTo(gen8) != 0))
			apto += 1;

		if ((gen6.compareTo(gen0) != 0) && (gen6.compareTo(gen1) != 0) && (gen6.compareTo(gen2) != 0)
				&& (gen6.compareTo(gen3) != 0) && (gen6.compareTo(gen4) != 0) && (gen6.compareTo(gen5) != 0)
				&& (gen6.compareTo(gen7) != 0) && (gen6.compareTo(gen8) != 0))
			apto += 1;

		if ((gen7.compareTo(gen0) != 0) && (gen7.compareTo(gen1) != 0) && (gen7.compareTo(gen2) != 0)
				&& (gen7.compareTo(gen3) != 0) && (gen7.compareTo(gen4) != 0) && (gen7.compareTo(gen5) != 0)
				&& (gen7.compareTo(gen6) != 0) && (gen7.compareTo(gen8) != 0))
			apto += 1;

		if ((gen8.compareTo(gen0) != 0) && (gen8.compareTo(gen1) != 0) && (gen8.compareTo(gen2) != 0)
				&& (gen8.compareTo(gen3) != 0) && (gen8.compareTo(gen4) != 0) && (gen8.compareTo(gen5) != 0)
				&& (gen8.compareTo(gen6) != 0) && (gen8.compareTo(gen7) != 0))
			apto += 1;

	}

}
