.class public final Lw3/u8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lw3/c8;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lw3/u8;)Lw3/c8;
    .locals 0

    iget-object p0, p0, Lw3/u8;->a:Lw3/c8;

    return-object p0
.end method


# virtual methods
.method public final b(Lw3/c8;)Lw3/u8;
    .locals 0

    iput-object p1, p0, Lw3/u8;->a:Lw3/c8;

    return-object p0
.end method

.method public final c()Lw3/v8;
    .locals 2

    new-instance v0, Lw3/v8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lw3/v8;-><init>(Lw3/u8;Lw3/t8;)V

    return-object v0
.end method
