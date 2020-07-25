package com.victorpereira.recomendator;

import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

public class RecomendaFilmes {

	public static void main(String[] args) throws IOException, TasteException {
		DataModel filmes = new Recomendador().getModeloDeFilmes();
		Recommender recommender = new RecomendadorBuilder().buildRecommender(filmes);

		List<RecommendedItem> recommendations = recommender.recommend(4, 3);

		for (RecommendedItem rec : recommendations) {
			System.out.println("Você pode gostar destes filmes =D");
			System.out.println(rec);
		}
	}
}
