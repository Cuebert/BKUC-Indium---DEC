.class final Lb5/c0;
.super Lb5/f;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb5/f;-><init>()V

    return-void
.end method


# virtual methods
.method final a(Ljava/lang/String;)Lb5/f;
    .locals 1

    const-string v0, "Null token"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lb5/c0;->a:Ljava/lang/String;

    return-object p0
.end method

.method final b()Lb5/c$b;
    .locals 3

    iget-object v0, p0, Lb5/c0;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v1, Lb5/e0;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lb5/e0;-><init>(Ljava/lang/String;Lb5/d0;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required properties: token"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
