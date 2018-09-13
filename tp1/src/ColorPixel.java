/**
 * Classe de pixel en couleurs 
 * @author :
 * @date : 
 */

public class ColorPixel extends AbstractPixel
{
	public int[] rgb; // donnees de l'image
	
	/**
	 * Constructeur par defaut (pixel blanc)
	 */
	ColorPixel()
	{
		rgb = new int[3];
		rgb[0] = 255;
		rgb[1] = 255;
		rgb[2] = 255;
	}
	
	/**
	 * Assigne une valeur au pixel
	 * @param rgb: valeurs a assigner 
	 */
	ColorPixel(int[] rgb)
	{
		// compléter
		this.rgb = new int[3];
		this.rgb[0] = rgb[0]; 
		this.rgb[1] = rgb[1]; 
		this.rgb[2] = rgb[2]; 
	}
	
	/**
	 * Renvoie un pixel copie de type noir et blanc
	 */
	public BWPixel toBWPixel()
	{
		// compléter
		BWPixel bwpixel;
		float moy =(rgb[0] + rgb[1] + rgb[2]) / 3.0f;
		if((int)moy < 127) {
			bwpixel = new BWPixel(false);
			return bwpixel;
		}
		bwpixel = new BWPixel(true);
		return bwpixel;
	}
	
	/**
	 * Renvoie un pixel copie de type tons de gris
	 */
	public GrayPixel toGrayPixel()
	{
		// compléter
		float moy =(rgb[0] + rgb[1] + rgb[2]) / 3.0f;
		
		return new GrayPixel((int)moy);
	}
	
	/**
	 * Renvoie un pixel copie de type couleurs
	 */
	public ColorPixel toColorPixel()
	{
		// compléter
		return this;
	}
	
	public TransparentPixel toTransparentPixel()
	{
		// compléter
		return new TransparentPixel(new int[] {rgb[0], rgb[1], rgb[2], 255});
	}
	
	/**
	 * Renvoie le negatif du pixel (255-pixel)
	 */
	public AbstractPixel Negative()
	{
		// compléter
		AbstractPixel absPixel;
		absPixel = new ColorPixel(new int[] {255 - rgb[0], 255 - rgb[1], 255 - rgb[2]});
		return absPixel;
	}
	
	public void setAlpha(int alpha)
	{
		//ne fait rien
	}
	
	/**
	 * Convertit le pixel en String (sert a ecrire dans un fichier 
	 * (avec un espace supplémentaire en fin)s
	 */
	public String toString()
	{
		return  ((Integer)rgb[0]).toString() + " " + 
				((Integer)rgb[1]).toString() + " " +
				((Integer)rgb[2]).toString() + " ";
	}
}