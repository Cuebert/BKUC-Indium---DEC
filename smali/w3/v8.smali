.class public final Lw3/v8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lw3/c8;


# direct methods
.method synthetic constructor <init>(Lw3/u8;Lw3/t8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw3/u8;->a(Lw3/u8;)Lw3/c8;

    move-result-object p1

    iput-object p1, p0, Lw3/v8;->a:Lw3/c8;

    return-void
.end method


# virtual methods
.method public final a()Lw3/c8;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lw3/v8;->a:Lw3/c8;

    return-object v0
.end method
