.class final Lz2/v;
.super Lz2/w;
.source "SourceFile"


# instance fields
.field final synthetic n:Landroid/content/Intent;

.field final synthetic o:Ly2/g;


# direct methods
.method constructor <init>(Landroid/content/Intent;Ly2/g;I)V
    .locals 0

    iput-object p1, p0, Lz2/v;->n:Landroid/content/Intent;

    iput-object p2, p0, Lz2/v;->o:Ly2/g;

    invoke-direct {p0}, Lz2/w;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lz2/v;->n:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lz2/v;->o:Ly2/g;

    const/4 v2, 0x2

    invoke-interface {v1, v0, v2}, Ly2/g;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
