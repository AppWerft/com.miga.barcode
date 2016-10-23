package com.miga.barcode;

import com.google.android.gms.vision.MultiProcessor;
import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.barcode.Barcode;
import android.util.SparseArray;

class BarcodeTrackerFactory implements MultiProcessor.Factory<Barcode> {
    @Override
    public Tracker<Barcode> create(Barcode barcode) {
        return new MyBarcodeTracker();
	}
} 
