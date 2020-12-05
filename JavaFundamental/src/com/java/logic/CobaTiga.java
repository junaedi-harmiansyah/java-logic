package com.java.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CobaTiga {

	public static void main(String[] args) {
		CobaTiga res = new CobaTiga();
		Integer[] arr = { 4,5,0,12,4,5,4,5,4};
		System.out.println(res.solution(arr));
	}

	private Integer solution(Integer[] paramArr) {
		List<Integer> listFirst = new ArrayList<>();
		List<Integer> listSec = new ArrayList<>();

		Integer[] arrMain = paramArr;

		// TODO Auto-generated method stub
		Boolean sudahDisalin = true;
		Boolean newSec = true;

		for (int i = 0; i < arrMain.length; i++) {
			if (i < 2) {
				listFirst.add(arrMain[i]);
			} else {
				if (sudahDisalin && countDifferentNumber(listFirst) < 2) { // kalau isi list different number di bawah
																			// 2, add aja
					System.out.println("masuk ke if 1 ");
					listFirst.add(arrMain[i]);
				} else if (sudahDisalin && listFirst.contains(arrMain[i])) {// kalau angkanya sudah ada di dalem list,
																			// masukin aja lagi
					System.out.println("masuk ke if 2 ");
					listFirst.add(arrMain[i]);
				} else {
					System.out.println("count different list sec : " + countDifferentNumber(listSec));
					if (countDifferentNumber(listSec) < 2) {// kalau list sec sizenya/ isi angkanya masih 1
															// jenis,masukin aja langsung
						// dan ambil angka terakhir di list first
						System.out.println("masuk ke else 1 ");
						if (newSec) {
							System.out.println("new sec truee >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
							System.out.println("masuk ke else 2 ");
							System.out.println("size listsec : " + listSec.size());
							int angkaTerakir = listFirst.get(listFirst.size() - 1);
							System.out.println("angka terakhir :" + angkaTerakir);
							listSec.add(angkaTerakir);
						}
						listSec.add(arrMain[i]);

//						}
					} else {
						System.out.println("masuk ke else 3 ");
						List<Integer> tmpList = new ArrayList<>();
						// kalo angka sebelumnya sama
						for (int j = listSec.size() - 1; j >= 0; j--) {
//							if(listSec.get(j) == arrMain[i] ) {
							if (listSec.contains(arrMain[i])) {
								tmpList.add(listSec.get(j));
							} else {
								tmpList.add(listSec.get(j));
								System.out
										.println("<<<<<<<<<<<<<<<<<<<<<<<<<< masuk ke break isi tmpList : " + tmpList);
								break;
							}
						}

//						int angkaTerakir = listSec.get(listSec.size()-1);
						listSec = new ArrayList<>();
//						System.out.println("angka terakhir :"+angkaTerakir);
//						listSec.add(angkaTerakir);
						listSec.addAll(tmpList);
						tmpList = new ArrayList<>();
						listSec.add(arrMain[i]);
//						newSec = true;
					}
					newSec = false;
					sudahDisalin = false;
				}
			}

			if (listFirst.size() <= listSec.size()) {
				listFirst = new ArrayList<>();
				listFirst.addAll(listSec);
				listSec = new ArrayList<>();
				sudahDisalin = true;
			}

			System.out.println("looping ke :" + i);
			System.out.println("value arr : " + arrMain[i]);
			System.out.println("isi listFirst : " + listFirst);
			System.out.println("isi listSec : " + listSec);
			System.out.println("==================================");
		}
		System.out.println("isi list FINAL : " + listFirst);
		return listFirst.size();
	}

	private Integer countDifferentNumber(List<Integer> list) {
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer val : list) {
			map.put(val, val);
		}
		return map.size();
	}

}