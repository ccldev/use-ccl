def Image(imageResourceIO){
	java("javafx.scene.image.Image")(
		java("java.io.InputStream")(
			<r|r()>.bind(imageResourceIO.reader())
		)
	)
}