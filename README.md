# Android-bitmapresizer
This library is used to resizes a given bitmap most accurately and efficiently maintaining the original aspect ratio.

Using google suggested method of resizing bitmap with inSamplesize technique, images are not resized properly. The image size is reduced by a factor of 2 always and value will always be more than or equal to min (width,height).
Example : Lets say original image size is 4496 X 3000 and we want to resize it to 1200 X 800, by using android's default method image will be reduced to 2248 X 1500 because inSample size is power of 2.
Bitmap Resizer further reduces the size of the image such that final dimensions of the image will be min(height,width) maintaining the original aspect ratio. So using bitmap resizer final size will be 1200 X 800. Hence appropriate size, more saving, better accuracy. 


