.class public final Ls0/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ls0/i;


# direct methods
.method public constructor <init>(Ls0/i;)V
    .locals 1

    const-string v0, "credential"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls0/u;->a:Ls0/i;

    return-void
.end method


# virtual methods
.method public final a()Ls0/i;
    .locals 1

    iget-object v0, p0, Ls0/u;->a:Ls0/i;

    return-object v0
.end method
