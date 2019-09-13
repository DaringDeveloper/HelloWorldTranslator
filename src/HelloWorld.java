//import java.lang.*;

public
class HelloWorld
{
	public static void main(String args[])
	{
		final String language = args[0];

		final Translator translator = Translator.make(language);

		System.out.println( helloWorld(translator) );
	}

	public static String helloWorld(Vocabulary vocabulary)
	{
		// master branch
		return vocabulary.hello() + " " + vocabulary.world();
	}
}
