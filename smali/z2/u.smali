.class final Lz2/u;
.super Lz2/w;
.source "SourceFile"


# instance fields
.field final synthetic n:Landroid/content/Intent;

.field final synthetic o:Landroid/app/Activity;

.field final synthetic p:I


# direct methods
.method constructor <init>(Landroid/content/Intent;Landroid/app/Activity;I)V
    .locals 0

    iput-object p1, p0, Lz2/u;->n:Landroid/content/Intent;

    iput-object p2, p0, Lz2/u;->o:Landroid/app/Activity;

    iput p3, p0, Lz2/u;->p:I

    invoke-direct {p0}, Lz2/w;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lz2/u;->n:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lz2/u;->o:Landroid/app/Activity;

    iget v2, p0, Lz2/u;->p:I

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
