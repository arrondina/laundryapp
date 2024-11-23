package com.example.laundrytrackerapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.laundrytrackerapp.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class UploadFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_upload, container, false)
    }
}