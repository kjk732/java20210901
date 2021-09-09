package p10.exception.throws_ex;

public class custom {

	public static void main(String[] args) {

		try {
			String s = getImage("cat");

			System.out.println("찾은 이미지: " + s);
			System.out.println("프로그램 종료");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	public static String getImage(String name) {
		String[] images = { "dog", "lion" };

		for (String image : images) {
			if (image.equals(name)) {
				return image;
			}
		}

		throw new ImageNotFoundException(name + "를 찾으려고 했음");

	}

	public class ImageNotFoundException extends RuntimeException {

		public ImageNotFoundException() {

		}

		public ImageNotFoundException(String message) {
			super(message);
		}
	}
}
