.class Le7/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le7/b;->z0(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Le7/b;


# direct methods
.method constructor <init>(Le7/b;)V
    .locals 0

    iput-object p1, p0, Le7/b$a;->n:Le7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Le7/b$a;->n:Le7/b;

    invoke-virtual {p1}, Le7/b;->Q2()Z

    move-result p1

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Le7/b$a;->n:Le7/b;

    iget-boolean v0, p1, Le7/b;->l1:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    :cond_0
    return-void
.end method
