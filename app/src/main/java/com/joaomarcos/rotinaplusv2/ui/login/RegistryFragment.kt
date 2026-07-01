package com.joaomarcos.rotinaplusv2.ui.login

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.joaomarcos.rotinaplusv2.R
import androidx.fragment.app.Fragment

class RegistryFragment: Fragment(R.layout.fragment_registry) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Views
        val backArrowRegistry: ImageView = view.findViewById(R.id.back_arrow_registry);

        //Funções
        backArrowRegistry.setOnClickListener { setBackArrowListener() }
    }

    fun setBackArrowListener() {
        parentFragmentManager.beginTransaction()
            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
            .replace(R.id.fragment_container, LoginFragment())
            .commit()
    }
}