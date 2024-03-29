public
abstract class Translator implements Vocabulary
{
	public static Translator make(String language)
	{
		switch(language)
		{
		case "en": return new EnglishTranslator();
		case "ch": return new MandarinTranslator();
		case "fr":   return new FrenchTranslator();
		default: return null;
		}
	}
}

class EnglishTranslator extends Translator
{
	public String hello()  { return "Hello"; }
	public String world()  { return "World"; }
}

class MandarinTranslator extends Translator
{
	public String hello()  { return "Nihao"; }
	public String world()  { return "shijie"; }
}

class FrenchTranslator extends Translator
{
	public String hello()  { return "bonjour"; }
	public String world()  { return "monde"; }
}

