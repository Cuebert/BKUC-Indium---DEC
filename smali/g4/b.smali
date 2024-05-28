.class public Lg4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lg4/t;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lg4/t;

    invoke-direct {v0}, Lg4/t;-><init>()V

    iput-object v0, p0, Lg4/b;->a:Lg4/t;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lg4/b;->a:Lg4/t;

    invoke-virtual {v0}, Lg4/t;->c()V

    return-void
.end method

.method public b()Lg4/a;
    .locals 1

    iget-object v0, p0, Lg4/b;->a:Lg4/t;

    return-object v0
.end method
