package com.victorpereira.recomendator;

import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

public class RecomendaLivros {

	public static void main(String[] args) throws TasteException, IOException {
		DataModel produtos = new Recomendador().getModeloLivros();
		Recommender recommender = new RecomendadorBuilder().buildRecommender(produtos);

		System.out.println("usuario 1");
		List<RecommendedItem> recommendations = recommender.recommend(1, 4);

		for (RecommendedItem rec : recommendations) {
			System.out.println("usuario 1, estes livros combinam com você: ");
			System.out.println(rec);
		}

	}
}
