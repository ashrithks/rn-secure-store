
Pod::Spec.new do |s|
  s.name         = "RNSecureStore"
  s.version      = "1.0.0"
  s.summary      = "RNSecureStore"
  s.description  = <<-DESC
                  RNSecureStore
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "ashrithks" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/ashrithks/rn-secure-store.git", :tag => "master" }
  s.source_files  = "RNSecureStore/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  