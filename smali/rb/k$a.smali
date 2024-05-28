.class Lrb/k$a;
.super Lac/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrb/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lrb/k;


# direct methods
.method constructor <init>(Lrb/k;)V
    .locals 0

    iput-object p1, p0, Lrb/k$a;->k:Lrb/k;

    invoke-direct {p0}, Lac/a;-><init>()V

    return-void
.end method


# virtual methods
.method protected t()V
    .locals 1

    iget-object v0, p0, Lrb/k$a;->k:Lrb/k;

    invoke-virtual {v0}, Lrb/k;->d()V

    return-void
.end method
