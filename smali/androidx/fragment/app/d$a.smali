.class Landroidx/fragment/app/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/savedstate/SavedStateRegistry$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/d;->A0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/fragment/app/d;


# direct methods
.method constructor <init>(Landroidx/fragment/app/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/d$a;->a:Landroidx/fragment/app/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    iget-object v1, p0, Landroidx/fragment/app/d$a;->a:Landroidx/fragment/app/d;

    invoke-virtual {v1}, Landroidx/fragment/app/d;->B0()V

    .line 3
    iget-object v1, p0, Landroidx/fragment/app/d$a;->a:Landroidx/fragment/app/d;

    iget-object v1, v1, Landroidx/fragment/app/d;->y:Landroidx/lifecycle/m;

    sget-object v2, Landroidx/lifecycle/f$b;->ON_STOP:Landroidx/lifecycle/f$b;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/f$b;)V

    .line 4
    iget-object v1, p0, Landroidx/fragment/app/d$a;->a:Landroidx/fragment/app/d;

    iget-object v1, v1, Landroidx/fragment/app/d;->x:Landroidx/fragment/app/h;

    invoke-virtual {v1}, Landroidx/fragment/app/h;->x()Landroid/os/Parcelable;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "android:support:fragments"

    .line 5
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-object v0
.end method
