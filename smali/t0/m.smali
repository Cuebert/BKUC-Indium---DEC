.class public abstract Lt0/m;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field private final n:Ljava/lang/String;

.field private final o:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/CharSequence;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lt0/m;->n:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lt0/m;->o:Ljava/lang/CharSequence;

    return-void
.end method
