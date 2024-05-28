.class Landroidx/fragment/app/z$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/z;->a(Landroidx/fragment/app/z$e$c;Landroidx/fragment/app/z$e$b;Landroidx/fragment/app/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Landroidx/fragment/app/z$d;

.field final synthetic o:Landroidx/fragment/app/z;


# direct methods
.method constructor <init>(Landroidx/fragment/app/z;Landroidx/fragment/app/z$d;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/z$b;->o:Landroidx/fragment/app/z;

    iput-object p2, p0, Landroidx/fragment/app/z$b;->n:Landroidx/fragment/app/z$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z$b;->o:Landroidx/fragment/app/z;

    iget-object v0, v0, Landroidx/fragment/app/z;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/z$b;->n:Landroidx/fragment/app/z$d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/z$b;->o:Landroidx/fragment/app/z;

    iget-object v0, v0, Landroidx/fragment/app/z;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/z$b;->n:Landroidx/fragment/app/z$d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
