 package com.lib.arche.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*accés aux données*/
@Data
@NoArgsConstructor
@AllArgsConstructor
/*un item dans la ligne*/
public class LignePanier {
	private int qte;
	private Article article;
}

