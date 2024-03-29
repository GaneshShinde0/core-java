package com.ganesh.others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.StringTokenizer;

public class HashMapLibrary {

	String bookName;
	String author;

	HashMapLibrary() {
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 83 * hash + Objects.hashCode(this.bookName);
		hash = 83 * hash + Objects.hashCode(this.author);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final HashMapLibrary other = (HashMapLibrary) obj;
		if (!Objects.equals(this.bookName, other.bookName)) {
			return false;
		}
		if (!Objects.equals(this.author, other.author)) {
			return false;
		}
		return true;
	}

	HashMapLibrary(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	public HashMap<Integer, HashMapLibrary> createLibraryMap(String booksInLibrary) {
		HashMap<Integer, HashMapLibrary> bookmap = new HashMap<Integer, HashMapLibrary>();

		StringTokenizer st = new StringTokenizer(booksInLibrary, "|");
		while (st.hasMoreTokens()) {
			StringTokenizer st2 = new StringTokenizer(st.nextToken(), ",");
			String id = st2.nextToken();
			HashMapLibrary b = new HashMapLibrary();
			b.bookName = st2.nextToken();
			b.author = st2.nextToken();
			bookmap.put(Integer.parseInt(id), b);

		}
		return bookmap;
	}

	public HashMap<Integer, Integer> createUserMap(String borrowedUsers) {
		HashMap<Integer, Integer> usermap = new HashMap<Integer, Integer>();
		StringTokenizer st = new StringTokenizer(borrowedUsers, "|");
		while (st.hasMoreTokens()) {
			StringTokenizer st2 = new StringTokenizer(st.nextToken(), ",");
			int id = Integer.parseInt(st2.nextToken());
			int b = Integer.parseInt(st2.nextToken());
			usermap.put(id, b);
		}
		return usermap;
	}

	public HashMap<Integer, ArrayList<Integer>> createUserMap2(String borrowedUsers) {

		HashMap<Integer, ArrayList<Integer>> usermap = new HashMap<Integer, ArrayList<Integer>>();

		StringTokenizer st = new StringTokenizer(borrowedUsers, "|");
		while (st.hasMoreTokens()) {
			StringTokenizer st2 = new StringTokenizer(st.nextToken(), ",");
			int b = Integer.parseInt(st2.nextToken());
			int id = Integer.parseInt(st2.nextToken());
			ArrayList<Integer> bb = usermap.getOrDefault(id, new ArrayList<Integer>() {
				private static final long serialVersionUID = 1L;
			});
			bb.add(b);
			usermap.put(id, bb);
		}
		return usermap;
	}

	public String getQuery(String booksInLibrary, String borrowedUsers, String query) {
		HashMap<Integer, HashMapLibrary> bookmap = createLibraryMap(booksInLibrary);
		HashMap<Integer, ArrayList<Integer>> usermap = createUserMap2(borrowedUsers);
		StringTokenizer st3 = new StringTokenizer(query, ",");
		ArrayList<String> deleted = new ArrayList<>();
		HashMap<Integer, HashMapLibrary> bookmapclone = createLibraryMap(booksInLibrary);
		for (Integer user : usermap.keySet()) {
			for (Integer bookid : usermap.get(user)) {
				// System.out.println(bookid);
				deleted.add(bookmap.get(bookid).bookName);
				bookmap.remove(bookid);
			}
		}

		while (st3.hasMoreTokens()) {
			String q = st3.nextToken();
			if (q.compareTo("1") == 0) {
				int userid = 0;
				int book = Integer.parseInt(st3.nextToken());
				// System.out.println(book+" target");
				if (bookmap.containsKey(book))
					return "It is available\nAuthor is " + bookmap.get(book).author + "\n";
				else {

					for (Integer user : usermap.keySet()) {
						for (Integer bookid : usermap.get(user)) {
							if (bookid == book) {
								userid = user;
							}
						}
					}
					return "No Stock\nIt is owned by " + userid + "\n";
				}

			} else if (q.compareTo("2") == 0) {
				int book = Integer.parseInt(st3.nextToken());
				String ans = "";
				ArrayList<Integer> beb = usermap.get(book);
				Collections.sort(beb);
				for (Integer bookid : beb) {
					// System.out.println(bookid);
					ans += bookid + " " + bookmapclone.get(bookid).bookName + "\n";

				}
				return ans;

			} else if (q.compareTo("3") == 0) {
				String book = st3.nextToken();
				int cnt = 0;
				for (String a : deleted)
					if (a.compareTo(book) == 0)
						cnt++;
				int cnt2 = 0;
				for (HashMapLibrary books : bookmap.values()) {

					if (books.bookName.compareTo(book) == 0)
						cnt2++;
				}

				return cnt + " out\n" + cnt2 + " in\n";

			} else if (q.compareTo("4") == 0) {
				String author = st3.nextToken();
				String ans = "";
				HashSet<String> hash = new HashSet<String>();
				for (HashMapLibrary books : bookmapclone.values()) {

					if (books.author.compareTo(author) == 0 && !hash.contains(books.bookName)) {
						ans += books.bookName + "\n";
						hash.add(books.bookName);
					}
				}
				return ans;

			} else {
				String search = st3.nextToken();
				String ans = "";

				for (Integer bookid : bookmapclone.keySet()) {
					String book = bookmapclone.get(bookid).bookName.toLowerCase();
					// System.out.println(book+" "+ search);

					if (book.contains(search)) {
						ans += bookid + " " + bookmapclone.get(bookid).bookName + "\n";
					}
				}
				return ans;

			}
		}
		return null;
	}

	public static void main(String[] args) {
		HashMapLibrary lib;
		lib = new HashMapLibrary();
		String actual = lib.getQuery(
				"1001,Adventures of Sherlock Holmes,Sir Arthur Conan Doyle|1002,Adventures of Tom Sawyer,The Mark Twain|1003,Alice in the Wonderland,Lewis Carroll|1004,All�s Well that Ends well,William Shakespeare|1005,As you like it,William Shakespeare|1006,Anand Math,Bankim Chandra Chatterjee",
				"1006,101|1003,102|1001,101", "2,101");
		String exp = "1001 Adventures of Sherlock Holmes\n1006 Anand Math\n";
		System.out.println(actual);
		System.out.println(exp.contains(actual));
	}
}
