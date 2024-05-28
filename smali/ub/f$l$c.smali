.class Lub/f$l$c;
.super Lpb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lub/f$l;->l(ZLub/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic o:Lub/f$l;


# direct methods
.method varargs constructor <init>(Lub/f$l;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lub/f$l$c;->o:Lub/f$l;

    invoke-direct {p0, p2, p3}, Lpb/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 2

    iget-object v0, p0, Lub/f$l$c;->o:Lub/f$l;

    iget-object v0, v0, Lub/f$l;->p:Lub/f;

    iget-object v1, v0, Lub/f;->o:Lub/f$j;

    invoke-virtual {v1, v0}, Lub/f$j;->b(Lub/f;)V

    return-void
.end method
