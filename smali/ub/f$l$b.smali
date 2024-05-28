.class Lub/f$l$b;
.super Lpb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lub/f$l;->d(ZLub/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic o:Z

.field final synthetic p:Lub/m;

.field final synthetic q:Lub/f$l;


# direct methods
.method varargs constructor <init>(Lub/f$l;Ljava/lang/String;[Ljava/lang/Object;ZLub/m;)V
    .locals 0

    iput-object p1, p0, Lub/f$l$b;->q:Lub/f$l;

    iput-boolean p4, p0, Lub/f$l$b;->o:Z

    iput-object p5, p0, Lub/f$l$b;->p:Lub/m;

    invoke-direct {p0, p2, p3}, Lpb/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 3

    iget-object v0, p0, Lub/f$l$b;->q:Lub/f$l;

    iget-boolean v1, p0, Lub/f$l$b;->o:Z

    iget-object v2, p0, Lub/f$l$b;->p:Lub/m;

    invoke-virtual {v0, v1, v2}, Lub/f$l;->l(ZLub/m;)V

    return-void
.end method
