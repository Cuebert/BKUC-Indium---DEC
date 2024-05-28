.class public Ll7/e;
.super Ll9/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll7/e$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "Localization"

    .line 1
    invoke-direct {p0, v0}, Ll9/b;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v0, Ll7/e$a;

    invoke-direct {v0, p0}, Ll7/e$a;-><init>(Ll7/e;)V

    const-string v1, "languageChangeTrigger"

    invoke-virtual {p0, v1, v0}, Ll9/b;->d(Ljava/lang/String;Ll9/b$b;)V

    return-void
.end method
