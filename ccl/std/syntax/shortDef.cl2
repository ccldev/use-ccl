#snippet def\s*([a-zA-Z0-9_]*)\s*\(([,a-zA-Z0-9_\s]*)\)\s*=\s*(.*) def %s(%s){%s}
#snippet def\s*([a-zA-Z0-9_]*)(.*) def %1$s(%1$s){%1$s%2$s}