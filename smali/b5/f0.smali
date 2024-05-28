.class final Lb5/f0;
.super Lb5/c$d$a;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb5/c$d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lb5/c$d;
    .locals 3

    new-instance v0, Lb5/h0;

    iget-object v1, p0, Lb5/f0;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb5/h0;-><init>(Ljava/lang/String;Lb5/g0;)V

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lb5/c$d$a;
    .locals 0

    iput-object p1, p0, Lb5/f0;->a:Ljava/lang/String;

    return-object p0
.end method
