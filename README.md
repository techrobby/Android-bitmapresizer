# Android-bitmapresizer
This library is used to resizes a given bitmap most accurately and efficiently maintaining the original aspect ratio.

Using google suggested method of resizing bitmap with inSamplesize technique, images are not resized properly. The image size is reduced by a factor of 2 always and value will always be more than or equal to min (width,height).

Example : Lets say original image size is 4496 X 3000 and we want to resize it to 1200 X 800, by using android's default method image will be reduced to 2248 X 1500 because inSample size is power of 2.

Bitmap Resizer further reduces the size of the image such that final dimensions of the image will be min(height,width) maintaining the original aspect ratio. So using bitmap resizer final size will be 1200 X 800. Hence appropriate size, more saving, better accuracy. 


# Usage

Just use "BitmapResizerFactpry.scaleDownBitmap(Resources res, int resId, int reqWidth, int reqHeight, Bitmap.Config config, boolean finResMoreThanReq, boolean scaleUp)" and its done.

# Addons

Along with resizing logic, it contains some Bitmap utility functions such as :

1. "Bitmap getCircularBitmap(Bitmap bitmap)" : This method creates a circular bitmap from the bitmap passed as parameter with center as bitmap center and radius equal to half of shorter side of bitmap.

2. "Bitmap getBitMapFromTV(View textView)" : Get bitmap from textview.

3. "Bitmap rotateBitmap(Bitmap bitmap, int degrees)" : Rotates a bitmap by degrees angle.

4. "Bitmap makeSquareThumbnail(Bitmap thumbnail, int dimensionLimit)" : Crops the bitmap from all sides to make it a square bitmap , if parameter <code>dimensionLimit</code> is given as -1 then the side of the square bitmap will be equal to the shorter side of the original bitmap otherwise it will be equal to dimensionLimit.