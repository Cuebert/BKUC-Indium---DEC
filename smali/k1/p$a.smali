.class Lk1/p$a;
.super Lk1/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk1/p;->d0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lk1/l;

.field final synthetic b:Lk1/p;


# direct methods
.method constructor <init>(Lk1/p;Lk1/l;)V
    .locals 0

    iput-object p1, p0, Lk1/p$a;->b:Lk1/p;

    iput-object p2, p0, Lk1/p$a;->a:Lk1/l;

    invoke-direct {p0}, Lk1/m;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lk1/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/p$a;->a:Lk1/l;

    invoke-virtual {v0}, Lk1/l;->d0()V

    .line 2
    invoke-virtual {p1, p0}, Lk1/l;->Z(Lk1/l$f;)Lk1/l;

    return-void
.end method
