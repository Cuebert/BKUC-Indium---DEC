.class Lk1/n$a$a;
.super Lk1/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk1/n$a;->onPreDraw()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh0/a;

.field final synthetic b:Lk1/n$a;


# direct methods
.method constructor <init>(Lk1/n$a;Lh0/a;)V
    .locals 0

    iput-object p1, p0, Lk1/n$a$a;->b:Lk1/n$a;

    iput-object p2, p0, Lk1/n$a$a;->a:Lh0/a;

    invoke-direct {p0}, Lk1/m;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lk1/l;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk1/n$a$a;->a:Lh0/a;

    iget-object v1, p0, Lk1/n$a$a;->b:Lk1/n$a;

    iget-object v1, v1, Lk1/n$a;->o:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Lh0/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 2
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 3
    invoke-virtual {p1, p0}, Lk1/l;->Z(Lk1/l$f;)Lk1/l;

    return-void
.end method
