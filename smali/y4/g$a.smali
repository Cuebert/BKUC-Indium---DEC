.class Ly4/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly4/l$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly4/g;-><init>(Ly4/g$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly4/g;


# direct methods
.method constructor <init>(Ly4/g;)V
    .locals 0

    iput-object p1, p0, Ly4/g$a;->a:Ly4/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ly4/m;Landroid/graphics/Matrix;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Ly4/g$a;->a:Ly4/g;

    invoke-static {v0}, Ly4/g;->b(Ly4/g;)Ljava/util/BitSet;

    move-result-object v0

    add-int/lit8 v1, p3, 0x4

    invoke-virtual {p1}, Ly4/m;->e()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/util/BitSet;->set(IZ)V

    .line 2
    iget-object v0, p0, Ly4/g$a;->a:Ly4/g;

    invoke-static {v0}, Ly4/g;->d(Ly4/g;)[Ly4/m$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Ly4/m;->f(Landroid/graphics/Matrix;)Ly4/m$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method

.method public b(Ly4/m;Landroid/graphics/Matrix;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly4/g$a;->a:Ly4/g;

    invoke-static {v0}, Ly4/g;->b(Ly4/g;)Ljava/util/BitSet;

    move-result-object v0

    invoke-virtual {p1}, Ly4/m;->e()Z

    move-result v1

    invoke-virtual {v0, p3, v1}, Ljava/util/BitSet;->set(IZ)V

    .line 2
    iget-object v0, p0, Ly4/g$a;->a:Ly4/g;

    invoke-static {v0}, Ly4/g;->c(Ly4/g;)[Ly4/m$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Ly4/m;->f(Landroid/graphics/Matrix;)Ly4/m$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method
